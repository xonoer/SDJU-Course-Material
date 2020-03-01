//
//  main.m
//  3_14
//
//  Created by 王阳 on 2019/3/20.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <Foundation/Foundation.h>
int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int i,sum;
        i = 0;
        sum = 0;
        do{
            sum += i;
            i++;
        }while(i <= 100);
        NSLog(@"%i",sum);
    }
    return 0;
}
