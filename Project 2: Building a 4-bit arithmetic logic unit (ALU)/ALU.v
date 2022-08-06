`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Create Date: 08/06/2022 10:06:01 AM
// Module Name: ALU
// Project Name: simpleALU
// Description: Building a 4-bit arithmetic logic unit (ALU)
// 
//////////////////////////////////////////////////////////////////////////////////
module ALU(
    input [3:0] aInt, // ALU A Int Input
    input [3:0] bInt, // ALU B Int Input
    input [1:0] opCode, // ALU Selection
    output reg [7:0] intResult
    );
  always @ (aInt,bInt)
    case (opCode)
      2'b00 : intResult = aInt + bInt; // Case One (Zeroin Binary): ALU Addition
      2'b01 : intResult = aInt * bInt; // Case Two (One in Binary): ALU Multiplication
      2'b10 : intResult = aInt % bInt; // Case Three (Two in Binary): ALU Modulo
      2'b11 : intResult = aInt & bInt; // Case Four (Three in Binary): ALU bitwise AND 
    endcase
endmodule
