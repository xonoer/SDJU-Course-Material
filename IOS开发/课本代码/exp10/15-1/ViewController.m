//
//  ViewController.m
//  exp10
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
    // Do any additional setup after loading the view, typically from a nib.
}


- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}


- (IBAction)show:(id)sender {
    CNContactPickerViewController *controller = [[CNContactPickerViewController alloc]init];
    [self presentViewController:controller animated:YES completion:nil];
}
@end
