package com.wuhantoc.javasample.utils;

import com.wuhantoc.javasample.enums.UnitEnum;

public class UnitConventer {

  private static final double FOOT_TO_YARD_RATIO = 1d / 3d;
  private static final double YARD_TO_INCH_RATIO = 36;

  public static double convertToYard(double number, UnitEnum unit) {
    if (UnitEnum.FOOT.equals(unit)) {
      return number * FOOT_TO_YARD_RATIO;
    }
    return -1;
  }

  public static double convertToInch(double number, UnitEnum unit) {
    if(UnitEnum.YARD.equals(unit)) {
      return number * YARD_TO_INCH_RATIO;
    }
    return -1;
  }

}
