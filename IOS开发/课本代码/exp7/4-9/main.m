//
//  main.m
//  4-9
//
//  Created by 王阳 on 2019/4/17.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        NSString *str1 = @"I Objective-C";
        NSMutableString *str2 = [NSMutableString stringWithString:str1];
        NSLog(@"插入前:%@",str2);
        [str2 insertString:@"Love " atIndex:2];
        NSLog(@"插入后:%@",str2);
    }
    return 0;
}
