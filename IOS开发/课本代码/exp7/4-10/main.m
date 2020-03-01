//
//  main.m
//  4-10
//
//  Created by 王阳 on 2019/4/17.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        NSString *str1 = @"I Love an Objective-C";
        NSMutableString *str2 = [NSMutableString stringWithString:str1];
        NSLog(@"删除前:%@",str2);
        [str2 deleteCharactersInRange:NSMakeRange(7,3)];
        NSLog(@"删除后:%@",str2);
    }
    return 0;
}
