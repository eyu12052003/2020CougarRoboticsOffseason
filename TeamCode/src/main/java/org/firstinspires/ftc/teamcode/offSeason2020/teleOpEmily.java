package org.firstinspires.ftc.teamcode.offSeason2020;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp

public class teleOpEmily extends OpMode{
    private DcMotor demiseArm;
    private double tolerance = 0.5;

@Override

    public void init(){
        demiseArm = hardwareMap.get(DcMotor.class, "demiseArm"); }

    public void loop(){
        if (gamepad1.left_stick_y < 0){ //Forwards

            demiseArm.setPower((gamepad1.left_stick_y));

        }

        if (gamepad1.left_stick_y > 0){ //Backwards

            demiseArm.setPower((gamepad1.left_stick_y));

        }
        if(gamepad1.right_stick_x < 0){ //Turning Left

            demiseArm.setPower((gamepad1.right_stick_x));

        }

        if(gamepad1.right_stick_x > 0){ //Turning Right

            demiseArm.setPower((gamepad1.right_stick_x));

        }

        if(Math.abs(gamepad1.left_stick_x) <= tolerance  || Math.abs(gamepad1.right_stick_x) <= tolerance || Math.abs(gamepad1.left_stick_y) <= tolerance || Math.abs(gamepad1.right_stick_y) <= tolerance) {
            demiseArm.setPower(0);
        }
    }

}
