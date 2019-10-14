package org.firstinspires.ftc.teamcode.FinalBot;

import android.hardware.Sensor;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.TouchSensor;

/*
    This class simply controls the intake system with motors/sensor
 */


public class BotIntake {

    TouchSensor touch;//touch sensor to detect a successful intake, can also use a distance sensor instead

    DcMotor[] motors = new DcMotor[2];//motors for the intake system
    //0:Left
    //1:Right

    public BotIntake(DcMotor left, DcMotor right, TouchSensor touch){
        motors[0] = left;
        motors[1] = right;
        this.touch = touch;
    }//basic constructor to create objects

    public void intakeStart(){

        //insert code here

    }//Starts the intake system

    public void intakeStop(){

        //insert code here

    }//stops the intake system

    public boolean intake(){

        //insert code here
        return false;

    }//intakes a block, returns true if a block is intaken, false if not. Use the touch sensor to determine if a block is in the bay
}