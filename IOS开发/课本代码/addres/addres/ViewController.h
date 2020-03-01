//
//  ViewController.h
//  addres
//
//  Created by Mac on 2019/5/21.
//  Copyright © 2019 hehejie. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <ContactsUI/ContactsUI.h>
#import <Contacts/Contacts.h>

@interface ViewController : UIViewController
@property (weak, nonatomic) IBOutlet UITextField *searchfiled;
@property (weak, nonatomic) IBOutlet UILabel *nameLabel;




- (IBAction)show:(id)sender;
- (IBAction)add:(id)sender;
- (IBAction)find:(id)sender;

@end

