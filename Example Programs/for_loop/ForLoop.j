.class public ForLoop
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; inti

.field private static i I

; intx

.field private static x I

.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

.method public static main([Ljava/lang/String;)V

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        ForLoop/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        ForLoop/_standardIn LPascalTextIn;

; x=2

	ldc	2
	putstatic	ForLoop/x I

; for(i=0;i<20;i=i+1){x=x*2;}

	ldc	0
	putstatic	ForLoop/i I
L000:
	getstatic	ForLoop/i I
	ldc	20
	if_icmplt	L002
	iconst_0
	goto	L003
L002:
	iconst_1
L003:
	ifeq	L001

; x=x*2

	getstatic	ForLoop/x I
	ldc	2
	imul
	putstatic	ForLoop/x I
	getstatic	ForLoop/i I
	ldc	1
	iadd
	putstatic	ForLoop/i I
	goto	L000
L001:

	getstatic     ForLoop/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
