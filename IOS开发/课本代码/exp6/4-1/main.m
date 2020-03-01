//
//  main.m
//  exp6
//
//  Created by 王阳 on 2019/4/10.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        NSNumber *n = [NSNumber numberWithChar:'A'];
        NSLog(@"%c" , [n charValue]);
    }
    return 0;
}
