//
//  ViewController.m
//  14-1
//
//  Created by 王阳 on 2019/5/29.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@interface CLLocationManager(Simulator)
@end

@implementation  CLLocationManager(Simulator)

-(void)startUpdatingLocation
{
    float latitude = 32.061;
    float longitude = 118.79125;
    CLLocation *location = [[CLLocation alloc]initWithLatitude:latitude  longitude:longitude];
    [self.delegate locationManager:self didUpdateLocations:[NSArray arrayWithObjects:location, nil]];
}


@end
@implementation ViewController

- (void)viewDidLoad {
    manager = [[CLLocationManager alloc]init];
    manager.delegate =self;
    [manager requestAlwaysAuthorization];
    [manager startUpdatingLocation];
    [super viewDidLoad];
    // Do any additional setup after loading the view.
}
-(void)locationManager:(CLLocationManager *)manager didUpdateLocations:(NSArray *)locations{
    CLLocation *currlocatin = [locations lastObject];
    _label1.text = [NSString stringWithFormat:@"%3.5f",currlocatin.coordinate.latitude];
    _label2.text = [NSString stringWithFormat:@"%3.5f",currlocatin.coordinate.longitude];
    _label3.text = [NSString stringWithFormat:@"%3.5f",currlocatin.altitude];
}

-(void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
}

@end
