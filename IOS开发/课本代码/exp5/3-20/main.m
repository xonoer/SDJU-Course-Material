//
//  main.m
//  3-20
//
//  Created by 王阳 on 2019/4/3.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Abb.h";
#import "Aaa.h";
int main(int argc, const char * argv[]) {
    @autoreleasepool {
        Aaa *a = [[Aaa alloc]init];
        Aaa *b = [[Abb alloc]init];
        [a print];
        [b print];
    }
    return 0;
}
