//
//  ViewController.h
//  14-1
//
//  Created by 王阳 on 2019/5/29.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <CoreLocation/CoreLocation.h>
@interface CLLocationManager(Simulator)
@end

@interface ViewController : UIViewController<CLLocationManagerDelegate>{
    CLLocationManager *manager;
}
@property (weak, nonatomic) IBOutlet UILabel *label1;
@property (weak, nonatomic) IBOutlet UILabel *label2;
@property (weak, nonatomic) IBOutlet UILabel *label3;

@end

