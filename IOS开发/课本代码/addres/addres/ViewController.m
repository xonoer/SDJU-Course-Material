//
//  ViewController.m
//  addres
//
//  Created by Mac on 2019/5/21.
//  Copyright © 2019 hehejie. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
    CNMutableContact *contact = [[CNMutableContact alloc]init];
    contact.givenName = @"呵";
    contact.familyName = @"杰";
    contact.imageData = UIImagePNGRepresentation([UIImage imageNamed:@"add"]);
    CNLabeledValue *homeEmail = [CNLabeledValue labeledValueWithLabel:CNLabelHome value:@"1234567@qq.com"];
    contact.emailAddresses = @[homeEmail];
    
    contact.phoneNumbers = @[[CNLabeledValue labeledValueWithLabel:CNLabelPhoneNumberiPhone value:[CNPhoneNumber phoneNumberWithStringValue:@"18018594138"]]];
    CNMutablePostalAddress *homeAdress = [[CNMutablePostalAddress alloc]init];
    homeAdress.city = @"上海";
    homeAdress.state = @"中国";
    contact.postalAddresses = @[[CNLabeledValue labeledValueWithLabel:CNLabelHome value:homeAdress]];

    NSDateComponents *birthday =[[NSDateComponents alloc]init];
    birthday.day = 7;
    birthday.month = 5;
    birthday.year = 1997;
    contact.birthday =birthday;
    CNSaveRequest *saveRequest = [[CNSaveRequest alloc]init];
    [saveRequest addContact:contact toContainerWithIdentifier:nil];
    CNContactStore * store = [[CNContactStore alloc]init];
    [store executeSaveRequest:saveRequest error:nil];
}


- (IBAction)show:(id)sender {
    CNContactPickerViewController *controller = [[CNContactPickerViewController alloc]init];
    [self presentViewController:controller animated:YES completion:nil];
    
}

- (IBAction)add:(id)sender {
    CNContact *con = [[CNContact alloc]init];
    CNContactViewController *controller = [CNContactViewController viewControllerForNewContact:con];
    controller.displayedPropertyKeys = @[CNContactGivenNameKey,CNContactPhoneNumbersKey,CNContactFamilyNameKey,CNContactInstantMessageAddressesKey,CNContactInstantMessageAddressesKey,CNContactDatesKey,CNContactUrlAddressesKey,CNContactBirthdayKey,CNContactImageDataKey];
    [self presentViewController:controller animated:YES completion:nil];
}

- (IBAction)find:(id)sender {
    CNContactStore *store = [[CNContactStore alloc]init];
    NSPredicate *predicate = [CNContact predicateForContactsMatchingName:_searchfiled.text];
    NSArray *contacts = [store unifiedContactsMatchingPredicate:predicate keysToFetch:@[CNContactGivenNameKey] error:nil];
    CNContact *contact = [contacts firstObject];
    if (contacts.count > 0) {
        _nameLabel.text = contact.givenName;
    }else{
        UIAlertController *alert = [UIAlertController alertControllerWithTitle:nil message:@"没有改联系人" preferredStyle:UIAlertControllerStyleAlert];
        UIAlertAction *cancle = [UIAlertAction actionWithTitle:@"确定" style:UIAlertActionStyleCancel handler:nil];
        [alert addAction:cancle];
        [self presentViewController:alert animated:YES completion:nil];
    }
}
@end
