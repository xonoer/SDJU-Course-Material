//
//  main.m
//  Insertsort
//
//  Created by 王阳 on 2019/3/16.
//  Copyright © 2019 wangyang. All rights reserved.
#import <Foundation/Foundation.h>
void printAarry(int R[],int n){
    int i=0;
    for(i=0;i<n;i++)
        NSLog(@"%d",R[i]);
}
void sort(int R[],int n){
    int i,j,k;
    for(i=0;i<n-1;i++)
        for(j=0;j<n-1;j++){
            if(R[j]>R[j+1]){
                k=R[j];
                R[j]=R[j+1];
                R[j+1]=k;
            }
        }
}
int main(int argc, const char * argv[]) {
    @autoreleasepool {
    int n,i,R[]={33,10,2,55,6};
    n=5;
    NSLog(@"排序前:");
    printAarry(R,n);
    sort(R,n);
    NSLog(@"排序后:");
    printAarry(R,n);
    return 0;
   }
}

