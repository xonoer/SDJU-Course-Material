//
//  main.m
//  4-8
//
//  Created by 王阳 on 2019/4/17.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        NSString *str1 = @"I Love";
        NSMutableString *str2 = [NSMutableString stringWithString:str1];
        NSLog(@"添加前:%@",str2);
        [str2 appendString:@"Objective-C"];
        NSLog(@"添加后:%@",str2);
    }
    return 0;
}
