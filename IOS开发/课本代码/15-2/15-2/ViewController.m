//
//  ViewController.m
//  15-2
//
//  Created by 王阳 on 2019/5/15.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import "ViewController.h"
@interface ViewController ()
@end
@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
}


- (IBAction)add:(id)sender {
    CNContact *con = [[CNContact alloc] init];
    CNContactViewController *controller = [CNContactViewController viewControllerForNewContact:con];
    [self presentViewController:controller animated:YES completion:nil];
}
 
@end
