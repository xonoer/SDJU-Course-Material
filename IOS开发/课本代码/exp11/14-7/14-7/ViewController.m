//
//  ViewController.m
//  14-7
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
    CLLocationCoordinate2D coor = {51.65,-0.35};
    NSDictionary *address = [NSDictionary dictionaryWithObjectsAndKeys:@"英国",@"Country",@"伦敦",@"Locality",nil];
    MKPlacemark *lun = [[MKPlacemark alloc]initWithCoordinate:coor addressDictionary:address];
    [_map addAnnotation:lun];
    [_map setCenterCoordinate:coor animated:YES];
}
@end
