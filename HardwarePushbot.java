package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

@Disabled
public class HardwarePushbot {

    //Motors for wheels
    public DcMotor leftFrontDrive = null;
    public DcMotor rightFrontDrive = null;
    public DcMotor leftBackDrive = null;
    public DcMotor rightBackDrive = null;

    //public DcMotor topPinion = null;
    //public DcMotor bottomPinion = null;


    //higher intakes

    public DcMotor leftIntake = null;
    public DcMotor rightIntake = null;
    //lower intakes
    public DcMotor leftBackIntake = null;
    public DcMotor rightBackIntake = null;



    public Servo leftPullSystem = null;
    public Servo rightPullSystem = null;
/*
    public Servo clamp = null;

    public DcMotor leftArm = null;
    public DcMotor rightArm = null;

    //color sensor
    public ColorSensor sensorColor = null;
    public DistanceSensor sensorDistance = null;

    //

*/

    //Hardware Map
    HardwareMap hwMap           =  null;


    /* Constructor */
    public HardwarePushbot(){

    }

    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        // Define and Initialize Motors
        //Wheel Motors
        leftFrontDrive  = hwMap.get(DcMotor.class, "lfd");
        rightFrontDrive = hwMap.get(DcMotor.class, "rfd");
        leftBackDrive = hwMap.get(DcMotor.class, "lbd");
        rightBackDrive= hwMap.get(DcMotor.class, "rbd");

        //topPinion = hwMap.get(DcMotor.class, "topPinion");
        //bottomPinion = hwMap.get(DcMotor.class, "bottomPinion");




        //Intake Motors
      leftIntake = hwMap.get(DcMotor.class, "lIntake");
      rightIntake = hwMap.get(DcMotor.class, "rIntake");
      leftBackIntake = hwMap.get(DcMotor.class, "lbi");
      rightBackDrive = hwMap.get(DcMotor.class, "rbi");
        leftPullSystem = hwMap.get(Servo.class, "lps");
        rightPullSystem = hwMap.get(Servo.class, "rps");

        //sets the direction of the motors
        //Wheel Motors
        leftFrontDrive.setDirection(DcMotor.Direction.REVERSE); // Set to REVERSE if using AndyMark motors
        rightFrontDrive.setDirection(DcMotor.Direction.REVERSE);// Set to FORWARD if using AndyMark motors
        leftBackDrive.setDirection(DcMotor.Direction.REVERSE);
        rightBackDrive.setDirection(DcMotor.Direction.FORWARD);

       // topPinion.setDirection(DcMotor.Direction.FORWARD);  //change depending on Test
        //bottomPinion.setDirection(DcMotor.Direction.FORWARD);

        rightPullSystem.setDirection(Servo.Direction.FORWARD);
        leftPullSystem.setDirection(Servo.Direction.FORWARD);

        //Intake Motors
       leftIntake.setDirection(DcMotor.Direction.FORWARD);
       rightIntake.setDirection(DcMotor.Direction.REVERSE);
       leftBackIntake.setDirection(DcMotorSimple.Direction.FORWARD);
       rightBackDrive.setDirection(DcMotor.Direction.REVERSE);
        //leftPullSystem.setPosition(0);
        //rightPullSystem.setPosition(1);



        // Set all motors to zero power
        //Wheel Motors
        leftFrontDrive.setPower(0);
        rightFrontDrive.setPower(0);
        leftBackDrive.setPower(0);
        rightBackDrive.setPower(0);



        //topPinion.setPower(0);
        //bottomPinion.setPower(0);

        //Intake Motors
        leftIntake.setPower(0);
        rightIntake.setPower(0);

        // Set all motors to run without encoders.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
        //Wheel Motors
        leftFrontDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightFrontDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftBackDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightBackDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);




       // topPinion.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        //bottomPinion.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);


        //Intake Motors
        leftIntake.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightIntake.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftBackIntake.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightBackIntake.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        leftPullSystem.setPosition(0);
        rightPullSystem.setPosition(0);
/*
        //Arm
        leftArm = hwMap.get(DcMotor.class, "rightArm");
        rightArm = hwMap.get(DcMotor.class, "leftArm");

        clamp = hwMap.get(Servo.class, "clamp");

        leftArm.setDirection(DcMotor.Direction.FORWARD);
        rightArm.setDirection(DcMotor.Direction.REVERSE);

        clamp.setPosition(0);

        leftArm.setPower(0);
        rightArm.setPower(0);

        leftArm.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightArm.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        //sensorColor = hwMap.get(ColorSensor.class, "colorSensor");
        //sensorDistance = hwMap.get(DistanceSensor.class, "distance");

 */
    }
}