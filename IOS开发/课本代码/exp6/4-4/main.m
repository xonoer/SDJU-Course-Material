//
//  main.m
//  4-4
//
//  Created by 王阳 on 2019/4/10.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        NSString *str1 = @"I Love ";
        NSString *str2 = @"I Love Objective-C";
        if([str1 isEqualToString:str2]){
            NSLog(@"两字符串相同");
        }
        else{
            NSLog(@"两字符串不相同");
        }
    }
    return 0;
}
