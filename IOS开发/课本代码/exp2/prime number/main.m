//
//  main.m
//  exp2
//
//  Created by 王阳 on 2019/3/16.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <Foundation/Foundation.h>
int main(int argc, const char * argv[]) {
    int i = 0;
    @autoreleasepool {
        for(i=100;i<=200;i++){
            int j = 0;
            for(j = 2;j < i;j++){
                if(i % j == 0)
                    break;
            }
            if(j == i){
                NSLog(@"%d" , i);
            }
        }
    }
    return 0;
}


