//
//  main.m
//  4-5
//
//  Created by 王阳 on 2019/4/10.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        NSString *str = @"I Love Objective-C";
        NSLog(@"%@" , [str substringToIndex:6]);
    }
    return 0;
}
