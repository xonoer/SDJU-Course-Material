//
//  aa.m
//  exp4
//
//  Created by 王阳 on 2019/3/27.
//  Copyright © 2019 wangyang. All rights reserved.
//
#import <Foundation/Foundation.h>
#import "aa.h"
@implementation aa
int main(int argc,const char *argv[]){
    {
        aa *a = [[aa alloc]init];
        a -> abc = 20;
        NSLog(@"%i",a->abc);
    }
    return 0;
}
@end
