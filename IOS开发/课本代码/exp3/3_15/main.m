//
//  main.m
//  3_15
//
//  Created by 王阳 on 2019/3/20.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <Foundation/Foundation.h>
int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int i,sum;
        sum = 0;
        for(i = 1;i <= 100;i++){
            sum += i;
        }
        NSLog(@"%i",sum);
    }
    return 0;
}

