//
//  ViewController.m
//  14-6
//
//  Created by 王阳 on 2019/6/3.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
}
-(void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
}

- (IBAction)bindLocal:(id)sender {
    CLLocationCoordinate2D coor = {51.65,-0.34};
    [_map setCenterCoordinate:coor animated:YES];
}
@end
