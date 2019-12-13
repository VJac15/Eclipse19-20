package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp (name = "DriveTrain")
public class DriveTrain extends LinearOpMode {

    HardwarePushbot robot = new HardwarePushbot();
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() throws InterruptedException {

        robot.init(hardwareMap);

        waitForStart();


        while(opModeIsActive()) {
            if (gamepad1.b) {
                robot.leftBackDrive.setPower(1);
                robot.leftFrontDrive.setPower(1);
                robot.rightFrontDrive.setPower(1);
                robot.rightBackDrive.setPower(1);
            }

            if (gamepad1.a) {
                robot.leftBackDrive.setPower(-1);
                robot.leftFrontDrive.setPower(-1);
                robot.rightFrontDrive.setPower(-1);
                robot.rightBackDrive.setPower(-1);
            }

            if (gamepad1.x) {
                robot.leftFrontDrive.setPower(1);
                robot.rightFrontDrive.setPower(1);
                robot.leftBackDrive.setPower(-1);
                robot.rightBackDrive.setPower(-1);
            }

            if (gamepad1.y) {
                robot.leftFrontDrive.setPower(-1);
                robot.rightFrontDrive.setPower(-1);
                robot.rightBackDrive.setPower(1);
                robot.leftBackDrive.setPower(1);
            }
        }



    }
}
