/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    //public final static double kArmRampRate = 0.5;

    public static final class DriveConstants{
        public static final int LEFT_MASTER_PORT_ID = 0;
        public static final int LEFT_SLAVE_PORT_ID = 1;
        public static final int RIGHT_MASTER_PORT_ID = 2;
        public static final int RIGHT_SLAVE_PORT_ID = 3;
    }


    
    public static final class ArmConstants{
        public static final int kARM_MOTOR_ID= 4;
        public static final double kArmRampRate = 0.5;
		public static double kArmUpSpeed = 0.6;
		public static double kArmDownSpeed= -0.6;
        public static double kArmFullSpeed = 1.0;
        public static double kArmThreeQuarterSpeed = 0.75;
        public static double kArmHalfSpeed = 0.5;
        public static double kArmQuarterSpeed = 0.25;
        public static double kArmZeroSpeed = 0.00;
        
    }

    public final class JoystickButtonConstants {        // MANIPULATOR  CONTROLLER  // DRIVER CONTROLLER
        public static final int kA = 2;                 // intakeOn                 // turnOnAllMotors
        public static final int kB = 3;                 // intakeReverse            // intakeandSuckerOn
        public static final int kY = 4;                 // hopperOn                 // stopperandShooterOn
        public static final int kX = 1;                 // hopperReverse            // 
    
        public static final int kL1 = 5;                // suckerOn                 //
        public static final int kL2 = 7;                // suckerReverse            //
        //Left joystick when clicked
        public static final int kL3 = 11;               // armUp                    // fastDrive/slowDrive
    
        public static final int kR1 = 6;                // stopperOn                //
        public static final int kR2 = 8;                // stopperReverse           //
        //Right joystick when clicked 
        public static final int kR3 = 12;               // armDown                  //
    
        public static final int kBack = 9;              // shooterOn                //
        public static final int kStart = 10;            // ballLoadingCommandGroup  // 
    }

	public static final  int kL3 = 11;
  


}
