//
//  ViewController.h
//  14-7
//
//  Created by 王阳 on 2019/6/3.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <UIKit/UIKit.h>
#import<MapKit/MapKit.h>
@interface ViewController : UIViewController
- (IBAction)bindLocal:(id)sender;

@property (weak, nonatomic) IBOutlet MKMapView *map;

@end

