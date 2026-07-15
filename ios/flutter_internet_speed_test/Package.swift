// swift-tools-version: 5.9

import PackageDescription

let package = Package(
    name: "flutter_internet_speed_test",
    platforms: [
        .iOS("13.0"),
    ],
    products: [
        .library(name: "flutter-internet-speed-test", targets: ["flutter_internet_speed_test"])
    ],
    dependencies: [
        .package(name: "FlutterFramework", path: "../FlutterFramework")
    ],
    targets: [
        .target(
            name: "flutter_internet_speed_test",
            dependencies: [
                .product(name: "FlutterFramework", package: "FlutterFramework")
            ]
        )
    ]
)
