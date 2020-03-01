//
//  main.m
//  4-3
//
//  Created by 王阳 on 2019/4/10.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        NSString *str = @"I Love Objective-C";
        NSLog(@"转为大写:%@" , [str uppercaseString]);
        NSLog(@"转为小写:%@" , [str lowercaseString]);
    }
    return 0;
}
