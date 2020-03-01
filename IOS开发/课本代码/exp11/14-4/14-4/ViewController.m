//
//  ViewController.m
//  14-4
//
//  Created by 王阳 on 2019/5/29.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    array = [NSArray arrayWithObjects:@" Standard", @"Satellite", @"Hybird", nil];
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
}

-(NSInteger)numberOfComponentsInPickerView:(UIPickerView *)pickerView{
    return 1;
}

-(NSInteger)pickerView:(UIPickerView *)pickerView numberOfRowsInComponent:(NSInteger)component{
    return [array count];
}

-(NSString *)pickerView:(UIPickerView *)pickerView titleForRow:(NSInteger)row forComponent:(NSInteger)component{
    return [array objectAtIndex:row];
}

-(void)pickerView:(UIPickerView *)pickerView didSelectRow:(NSInteger)row inComponent:(NSInteger)component{
    NSInteger index = [pickerView selectedRowInComponent:0];
    if(index == 0){
        _map.mapType = MKMapTypeStandard;
    }
    else if(index == 1){
        _map.mapType = MKMapTypeSatellite;
    }
    else if(index == 2){
        _map.mapType = MKMapTypeHybrid;
    }
}
- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}


@end
