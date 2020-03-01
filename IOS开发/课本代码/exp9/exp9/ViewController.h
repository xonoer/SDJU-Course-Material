//
//  ViewController.h
//  exp9
//
//  Created by 王阳 on 2019/5/15.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface ViewController : UIViewController<UIWebViewDelegate>

@property (weak, nonatomic) IBOutlet UITextField *textfield;
@property (weak, nonatomic) IBOutlet UIWebView *webview;
- (IBAction)load:(id)sender;
@property (weak, nonatomic) IBOutlet UIImageView *imageview;
@property (weak, nonatomic) IBOutlet UIView *view1;
@property (weak, nonatomic) IBOutlet UIView *view2;
@property (weak, nonatomic) IBOutlet UIView *view3;
- (IBAction)loadWithButton:(id)sender;
- (IBAction)hiddenView:(id)sender;
- (IBAction)changeImage:(id)sender;
@property (weak, nonatomic) IBOutlet UIActivityIndicatorView *activityIndicatorView;


@end

