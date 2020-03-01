//
//  ViewController.m
//  exp9
//
//  Created by 王阳 on 2019/5/15.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    [_activityIndicatorView setHidden:YES];
    [_webview setUserInteractionEnabled:YES];
    _webview.delegate = self;
    [_view3 setHidden:YES];
}


- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (IBAction)loadWithButton:(id)sender {
    UIButton *button = (UIButton *)sender;
    NSString *url = @"";
    switch(button.tag){
        case 101:
            url = @"https://www.baidu.com";
            break;
        case 102:
            url = @"https://www.sina.com.cn";
            break;
        case 103:
            url = @"https://www.sohu.com";
            break;
        case 104:
            url = @"https://www.qq.com";
            break;
        case 105:
            url = @"https://www.163.com";
            break;
        case 106:
            url = @"https://www.youku.com";
            break;
        case 107:
            url = @"https://www.4399.com";
            break;
        case 108:
            url = @"https://www.17173.com";
            break;
        default:
            url = @"https://www.baidu.com";
            break;
    }
    NSURLRequest *request = [NSURLRequest requestWithURL:[NSURL URLWithString:url]];
    [_webview loadRequest:request];
    [_view1 setHidden:YES];
    [_view2 setHidden:YES];
    _webview.scalesPageToFit = YES;
    _imageview.hidden = YES;
}

- (IBAction)hiddenView:(id)sender {
    _view3.hidden = NO;
}

- (IBAction)changeImage:(id)sender {
    UIButton *button = (UIButton *)sender;
    NSString *image = @"";
    switch(button.tag){
        case 301:
            image = @"image3";
            break;
        case 302:
            image = @"image4";
            break;
        case 303:
            image = @"image5";
            break;
        case 304:
            image = @"image6";
            break;
        default:
            image = @"image3";
            break;
    }
    [_imageview setImage:[UIImage imageNamed:image]];
    _view3.hidden = YES;
}
- (IBAction)load:(id)sender {
    [_textfield restorationIdentifier];
    [self loadWebPageWithString:_textfield.text];
}
-(void) loadWebPageWithString:(NSString *)urlString{
    NSURL *url = [NSURL URLWithString:urlString];
    NSURLRequest *request = [NSURLRequest requestWithURL:url];
    [_webview loadRequest:request];
}
-(void)webViewDidFinishLoad:(UIWebView *)webView{
    [_activityIndicatorView stopAnimating];
    _activityIndicatorView.hidden = YES;
}
-(void)webViewDidStartLoad:(UIWebView *)webView{
    _activityIndicatorView.hidden = NO;
    [_activityIndicatorView startAnimating];
}
@end
