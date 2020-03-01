//
//  ViewController.h
//  14-4
//
//  Created by 王阳 on 2019/5/29.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <UIKit/UIKit.h>
#import<MapKit/MapKit.h>
@interface ViewController : UIViewController<UIPickerViewDataSource,UIPickerViewDelegate>{
    NSArray *array;
}
@property (weak, nonatomic) IBOutlet MKMapView *map;
@property (weak, nonatomic) IBOutlet UIPickerView *picker;


@end

