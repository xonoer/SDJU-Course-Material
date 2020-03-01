
#import <Foundation/Foundation.h>
int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int a;
        a = 5;
        switch (a) {
            case 1:
                NSLog(@"a=1");
                break;
            case 2:
                NSLog(@"a=2");
                break;
            case 3:
                NSLog(@"a=3");
                break;
            case 4:
                NSLog(@"a=4");
                break;
            default:
                NSLog(@"a=5");
                break;
        }
    }
    return 0;
}
