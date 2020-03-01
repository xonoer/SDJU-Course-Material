//
//  ViewController.m
//  14-3
//
//  Created by 王阳 on 2019/5/29.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import "ViewController.h"
#import <MapKit/MapKit.h>
@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    MKMapView *map = [[MKMapView alloc]initWithFrame:CGRectMake(10,10,355,355)];
    [self.view addSubview:map];
    [super viewDidLoad];
    // Do any additional setup after loading the view.
}
-(void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
}

@end
