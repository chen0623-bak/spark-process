package com.yeeiee.core.transform.abs

import com.yeeiee.constants.NumberConstant

/**
 * @Author: chen
 * @Date: 2023/7/5
 * @Desc:
 */
abstract class DoubleOperandTransform extends AbstractTransform {

  override def getOsn: Int = NumberConstant.NUMBER_2

  override def getOssDefault: List[Int] = List(NumberConstant.NUMBER_0, NumberConstant.NUMBER_1)
}
