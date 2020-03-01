//
//  appTests.m
//  appTests
//
//  Created by 王阳 on 2019/3/17.
//  Copyright © 2019 wangyang. All rights reserved.
//

#import <XCTest/XCTest.h>

@interface appTests : XCTestCase

@end

@implementation appTests

- (void)setUp {
    [super setUp];
    // Put setup code here. This method is called before the invocation of each test method in the class.
}

- (void)tearDown {
    // Put teardown code here. This method is called after the invocation of each test method in the class.
    [super tearDown];
}

- (void)testExample {
    // This is an example of a functional test case.
    // Use XCTAssert and related functions to verify your tests produce the correct results.
}

- (void)testPerformanceExample {
    // This is an example of a performance test case.
    [self measureBlock:^{
        // Put the code you want to measure the time of here.
    }];
}

@end
