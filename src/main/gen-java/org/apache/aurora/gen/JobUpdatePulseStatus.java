/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.aurora.gen;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * Status of the coordinated update. Intended as a response to pulseJobUpdate RPC.
 */
public enum JobUpdatePulseStatus implements org.apache.thrift.TEnum {
  /**
   * Update is active (ACK).
   */
  OK(1),
  /**
   * Update is paused and will not progress unless explicitly resumed (NACK).
   */
  PAUSED(2),
  /**
   * Update has reached terminal state.
   */
  FINISHED(3);

  private final int value;

  private JobUpdatePulseStatus(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static JobUpdatePulseStatus findByValue(int value) { 
    switch (value) {
      case 1:
        return OK;
      case 2:
        return PAUSED;
      case 3:
        return FINISHED;
      default:
        return null;
    }
  }
}