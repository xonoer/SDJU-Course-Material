//
//  main.m
//  4-11
//
//  Created by 王阳 on 2019/4/17.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        NSString *str1 = @"I Love an Objective-C";
        NSMutableString *str2 = [NSMutableString stringWithString:str1];
        NSLog(@"替换前:%@",str2);
        [str2 replaceCharactersInRange:NSMakeRange(7,14) withString:@"python"];
        NSLog(@"替换后:%@",str2);
    }
    return 0;
}
