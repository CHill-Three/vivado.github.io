`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// 
// Create Date: 05/28/2021 12:26:19 AM
// Design Name: Creating and Testing a Two To One Multiplexer
// Module Name: twoToOneMux
// 
//////////////////////////////////////////////////////////////////////////////////

module twoToOneMux
(
input [1:0] I,
input selection,
output reg Y
);

always @ (selection, I) begin
if (selection == 0)
Y=I[0];
else
Y=I[1];
end

endmodule

