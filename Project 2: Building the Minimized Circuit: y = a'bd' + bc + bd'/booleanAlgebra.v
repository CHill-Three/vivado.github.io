`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Create Date: 08/02/2022 05:26:01 PM
// Module Name: booleanAlgebra
// Project Name: mainProject
// Description: Build the Minimized Circuit: y = a'bd' + bc + bd'
// This 
//////////////////////////////////////////////////////////////////////////////////


module booleanAlgebra
(
input dWire,
input cWire,
input bWire,
input aWire,
output outWire
);
// NOT = ~
// AND = &
// OR = |
assign outWire = (~aWire & bWire & ~dWire) | (bWire & cWire) | (bWire & ~dWire);

endmodule
