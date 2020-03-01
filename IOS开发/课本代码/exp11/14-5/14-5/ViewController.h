//
//  ViewController.h
//  14-5
//
//  Created by 王阳 on 2019/6/2.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <UIKit/UIKit.h>
#import<MapKit/MapKit.h>
@interface ViewController : UIViewController{
    CLLocationManager *manager;
}

@property (weak, nonatomic) IBOutlet MKMapView *map;
- (IBAction)currentLocal:(id)sender;






@end

