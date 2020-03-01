//
//  main.m
//  exp7
//
//  Created by 王阳 on 2019/4/17.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        NSString *str = @"I Love";
        NSMutableString *str1 = [NSMutableString stringWithString:str];
        NSLog(@"设置前: %@",str1);
        [str1 setString:@"Objective-C"];
        NSLog(@"设置后:%@",str1);
    }
    return 0;
}
