//
//  main.m
//  exp5
//
//  Created by 王阳 on 2019/4/3.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Abb.h"
int main(int argc, const char * argv[]) {
    @autoreleasepool {
        Abb *a = [[Abb alloc]init];
        NSLog(@"%i",[a intVar]);
        [a print];
    }
    return 0;
}
