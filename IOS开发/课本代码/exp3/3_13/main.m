//
//  main.m
//  3_13
//
//  Created by 王阳 on 2019/3/20.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <Foundation/Foundation.h>
int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int i,sum;
        sum = 0;
        i = 1;
        while(i <= 100){
            sum += i;
            i++;
        }
        NSLog(@"%i",sum);
    }
    return 0;
}
