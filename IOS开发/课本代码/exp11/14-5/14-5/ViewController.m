//
//  ViewController.m
//  14-5
//
//  Created by 王阳 on 2019/6/2.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    manager = [[CLLocationManager alloc]init];
    [manager requestAlwaysAuthorization];
    [manager startUpdatingLocation];
}

-(void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
}


- (IBAction)currentLocal:(id)sender {
    _map.showsUserLocation = YES;
}
@end
