package com.beklas.android.footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final String TEAM_A_SYMBOL = "A";
    final String TEAM_B_SYMBOL = "B";

    final String RED_CARD       = "RED";
    final String YELLOW_CARD    = "YELLOW";

    private int goalTeamA   = 0;
    private int goalTeamB   = 0;
    private int faulTeamA   = 0;
    private int faulTeamB   = 0;
    private int yellowCardA = 0;
    private int yellowCardB = 0;
    private int redCardA    = 0;
    private int redCardB    = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initDefaultValues();
    }

    public void initDefaultValues(){

        this.diplayGoalForTeam(TEAM_A_SYMBOL);
        this.diplayGoalForTeam(TEAM_B_SYMBOL);

        this.diplayFaulForTeam(TEAM_A_SYMBOL);
        this.diplayFaulForTeam(TEAM_B_SYMBOL);

        this.diplayCardForTeam(TEAM_A_SYMBOL,RED_CARD);
        this.diplayCardForTeam(TEAM_A_SYMBOL,YELLOW_CARD);

        this.diplayCardForTeam(TEAM_B_SYMBOL,RED_CARD);
        this.diplayCardForTeam(TEAM_B_SYMBOL,YELLOW_CARD);
    }

    public void diplayGoalForTeam(String Which){
        switch (Which){
            case TEAM_A_SYMBOL:
                this.displayTextViewForTeam(R.id.team_goal_a,this.getGoalForTeamA());
                break;
            case TEAM_B_SYMBOL:
                this.displayTextViewForTeam(R.id.team_goal_b,this.getGoalForTeamB());
                break;
                default:
                    System.out.print("Nothing...");

        }
    }

    public void diplayFaulForTeam(String Which){
        switch (Which){
            case TEAM_A_SYMBOL:
                this.displayTextViewForTeam(R.id.team_faul_a,this.getFaulForTeamA());
                break;
            case TEAM_B_SYMBOL:
                this.displayTextViewForTeam(R.id.team_faul_b,this.getFaulForTeamB());
                break;
            default:
                System.out.print("Nothing...");

        }
    }

    public void diplayCardForTeam(String Which,String color){
        switch (color){
            case RED_CARD:
                    this.getRedCardTeam(Which);
                break;
            case YELLOW_CARD:
                    this.getYellowCardTeam(Which);
                break;
            default:
                System.out.print("Nothing...");

        }
    }

    private void getRedCardTeam(String Which){
        switch (Which) {
            case TEAM_A_SYMBOL:
                this.displayTextViewForTeam(R.id.red_carton_team_a,this.getRedCardTeamA());
            case TEAM_B_SYMBOL:
                this.displayTextViewForTeam(R.id.red_carton_team_b,this.getRedCardTeamB());
                    default:
                        System.out.print("Nothing...");
        }
    }

    private void getYellowCardTeam(String Which){
        switch (Which) {
            case TEAM_A_SYMBOL:
                this.displayTextViewForTeam(R.id.yellow_carton_team_a,this.getYellowCardTeamA());
            case TEAM_B_SYMBOL:
                this.displayTextViewForTeam(R.id.yellow_carton_team_b,this.getYellowCardTeamB());
            default:
                System.out.print("Nothing...");
        }
    }

    private void displayTextViewForTeam(int id,int goal){
        TextView textViewTeam;
        textViewTeam = (TextView) findViewById(id);
        textViewTeam.setText(String.valueOf(goal));
    }

    public void eventSetGoalTeamA(View view){
        this.setGoalTeamA();
        this.diplayGoalForTeam(TEAM_A_SYMBOL);
    }

    public void eventSetGoalTeamB(View view){
        this.setGoalTeamB();
        this.diplayGoalForTeam(TEAM_B_SYMBOL);
    }

    public void eventSetFaulTeamA(View view){
        this.setFaulTeamA();
        this.diplayFaulForTeam(TEAM_A_SYMBOL);
    }

    public void eventSetFaulTeamB(View view){
        this.setFaulTeamB();
        this.diplayFaulForTeam(TEAM_B_SYMBOL);
    }

    public void eventSetRedCardTeamA(View view){
        this.setRedCardTeamA();
        this.diplayCardForTeam(TEAM_A_SYMBOL,RED_CARD);
    }

    public void eventSetRedCardTeamB(View view){
        this.setRedCardTeamB();
        this.diplayCardForTeam(TEAM_B_SYMBOL,RED_CARD);
    }

    public void eventSetYellowCardTeamA(View view){
        this.setYellowCardTeamA();
        this.diplayCardForTeam(TEAM_A_SYMBOL,YELLOW_CARD);
    }

    public void eventSetYellowCardTeamB(View view){
        this.setYellowCardTeamB();
        this.diplayCardForTeam(TEAM_B_SYMBOL,YELLOW_CARD);
    }

    public void eventResetAll(View view){
        this.resetAllTeamValues();
        this.initDefaultValues();
    }

    public void resetAllTeamValues(){

        this.goalTeamA  = 0;
        this.goalTeamB  = 0;
        this.redCardA   = 0;
        this.redCardB   = 0;
        this.yellowCardA= 0;
        this.yellowCardB= 0;
        this.faulTeamA  = 0;
        this.faulTeamB  = 0;
    }

    public void setFaulTeamA(){
        this.faulTeamA = this.faulTeamA + 1;
    }

    public void setFaulTeamB(){
        this.faulTeamB = this.faulTeamB + 1;
    }

    public int getFaulForTeamA(){
        return faulTeamA;
    }

    public int getFaulForTeamB(){
        return faulTeamB;
    }

    public void setGoalTeamA(){
        this.goalTeamA = this.goalTeamA + 1;
    }

    public void setGoalTeamB(){
        this.goalTeamB = this.goalTeamB + 1;
    }

    public int getGoalForTeamA(){
        return goalTeamA;
    }

    public int getGoalForTeamB(){
        return goalTeamB;
    }
    public void setRedCardTeamA(){
        this.redCardA = this.redCardA + 1;
    }

    public void setRedCardTeamB(){
        this.redCardB = this.redCardB + 1;
    }

    public int getRedCardTeamA(){
        return redCardA;
    }

    public int getRedCardTeamB(){
        return redCardB;
    }

    public void setYellowCardTeamA(){
        this.yellowCardA = this.yellowCardA + 1;
    }

    public void setYellowCardTeamB(){
        this.yellowCardB = this.yellowCardB + 1;
    }

    public int getYellowCardTeamA(){
        return yellowCardA;
    }

    public int getYellowCardTeamB(){
        return yellowCardB;
    }
}
