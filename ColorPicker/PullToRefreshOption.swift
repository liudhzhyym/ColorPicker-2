//
//  PullToRefreshConst.swift
//  PullToRefreshSwift
//
//  Created by Yuji Hato on 12/11/14.
//
import UIKit

struct PullToRefreshConst {
    static let pullTag = 810
    static let alpha = true
    static let height: CGFloat = 80
    static let triggerDistance: CGFloat = 80
    static let imageName: String = "pulltorefresharrow.png"
    static let animationDuration: Double = 0.5
    static let fixedTop = true // PullToRefreshView fixed Top
}

public struct PullToRefreshOption {
    public var indicatorColor: UIColor
    public var autoStopTime: Double // 0 is not auto stop
    public var fixedSectionHeader: Bool // Update the content inset for fixed section headers
    
    public init(indicatorColor: UIColor = .gray, autoStopTime: Double = 0, fixedSectionHeader: Bool = false) {
        self.indicatorColor = indicatorColor
        self.autoStopTime = autoStopTime
        self.fixedSectionHeader = fixedSectionHeader
    }
}