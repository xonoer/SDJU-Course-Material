
#import <Foundation/Foundation.h>
int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int a;
        a=9;
        NSLog(@"%i,%i",a,++a);
        NSLog(@"%i,%i",a,a++);
        NSLog(@"%i,%i",a,--a);
        NSLog(@"%i,%i",a,a--);
        NSLog(@"%i",a);
    }
    return 0;
}
