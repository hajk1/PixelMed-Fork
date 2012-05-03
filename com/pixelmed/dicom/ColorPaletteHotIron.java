/* Copyright (c) 2001-2010, David A. Clunie DBA Pixelmed Publishing. All rights reserved. */

package com.pixelmed.dicom;

/**
 * <p>Standard DICOM Hot Iron color palette.</p>
 *
 * @author	dclunie
 */
public class ColorPaletteHotIron extends ColorPalette {
	private static final String identString = "@(#) $Header: /userland/cvs/pixelmed/imgbook/com/pixelmed/dicom/ColorPaletteHotIron.java,v 1.4 2010/01/31 11:59:04 dclunie Exp $";
	
	protected static String sopInstanceUIDStatic = "1.2.840.10008.1.5.1";
	protected static String contentLabelStatic = "HOT_IRON";
	protected static String contentDescriptionStatic = "Hot Iron";
	protected static String contentCreatorNameStatic = "PixelMed^Publishing";
	protected static String referenceEncodedInstanceURLStatic = "ftp://medical.nema.org/Medical/Dicom/Palettes/hotiron.dcm";
	
	protected static String[] alternateContentDescriptionStatic = { "Hot Iron", "Heisses Eisen" };
	protected static String[] alternateContentLanguageCodeValueStatic = { "fr", "de" };
	protected static String[] alternateContentLanguageCodeMeaningStatic = { "French", "German" };
	
	protected static byte[] redStaticArray = {
		(byte)0,
		(byte)2,
		(byte)4,
		(byte)6,
		(byte)8,
		(byte)10,
		(byte)12,
		(byte)14,
		(byte)16,
		(byte)18,
		(byte)20,
		(byte)22,
		(byte)24,
		(byte)26,
		(byte)28,
		(byte)30,
		(byte)32,
		(byte)34,
		(byte)36,
		(byte)38,
		(byte)40,
		(byte)42,
		(byte)44,
		(byte)46,
		(byte)48,
		(byte)50,
		(byte)52,
		(byte)54,
		(byte)56,
		(byte)58,
		(byte)60,
		(byte)62,
		(byte)64,
		(byte)66,
		(byte)68,
		(byte)70,
		(byte)72,
		(byte)74,
		(byte)76,
		(byte)78,
		(byte)80,
		(byte)82,
		(byte)84,
		(byte)86,
		(byte)88,
		(byte)90,
		(byte)92,
		(byte)94,
		(byte)96,
		(byte)98,
		(byte)100,
		(byte)102,
		(byte)104,
		(byte)106,
		(byte)108,
		(byte)110,
		(byte)112,
		(byte)114,
		(byte)116,
		(byte)118,
		(byte)120,
		(byte)122,
		(byte)124,
		(byte)126,
		(byte)128,
		(byte)130,
		(byte)132,
		(byte)134,
		(byte)136,
		(byte)138,
		(byte)140,
		(byte)142,
		(byte)144,
		(byte)146,
		(byte)148,
		(byte)150,
		(byte)152,
		(byte)154,
		(byte)156,
		(byte)158,
		(byte)160,
		(byte)162,
		(byte)164,
		(byte)166,
		(byte)168,
		(byte)170,
		(byte)172,
		(byte)174,
		(byte)176,
		(byte)178,
		(byte)180,
		(byte)182,
		(byte)184,
		(byte)186,
		(byte)188,
		(byte)190,
		(byte)192,
		(byte)194,
		(byte)196,
		(byte)198,
		(byte)200,
		(byte)202,
		(byte)204,
		(byte)206,
		(byte)208,
		(byte)210,
		(byte)212,
		(byte)214,
		(byte)216,
		(byte)218,
		(byte)220,
		(byte)222,
		(byte)224,
		(byte)226,
		(byte)228,
		(byte)230,
		(byte)232,
		(byte)234,
		(byte)236,
		(byte)238,
		(byte)240,
		(byte)242,
		(byte)244,
		(byte)246,
		(byte)248,
		(byte)250,
		(byte)252,
		(byte)254,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255,
		(byte)255
	};
	
	protected static byte[] greenStaticArray = {
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)2,
		(byte)4,
		(byte)6,
		(byte)8,
		(byte)10,
		(byte)12,
		(byte)14,
		(byte)16,
		(byte)18,
		(byte)20,
		(byte)22,
		(byte)24,
		(byte)26,
		(byte)28,
		(byte)30,
		(byte)32,
		(byte)34,
		(byte)36,
		(byte)38,
		(byte)40,
		(byte)42,
		(byte)44,
		(byte)46,
		(byte)48,
		(byte)50,
		(byte)52,
		(byte)54,
		(byte)56,
		(byte)58,
		(byte)60,
		(byte)62,
		(byte)64,
		(byte)66,
		(byte)68,
		(byte)70,
		(byte)72,
		(byte)74,
		(byte)76,
		(byte)78,
		(byte)80,
		(byte)82,
		(byte)84,
		(byte)86,
		(byte)88,
		(byte)90,
		(byte)92,
		(byte)94,
		(byte)96,
		(byte)98,
		(byte)100,
		(byte)102,
		(byte)104,
		(byte)106,
		(byte)108,
		(byte)110,
		(byte)112,
		(byte)114,
		(byte)116,
		(byte)118,
		(byte)120,
		(byte)122,
		(byte)124,
		(byte)126,
		(byte)128,
		(byte)130,
		(byte)132,
		(byte)134,
		(byte)136,
		(byte)138,
		(byte)140,
		(byte)142,
		(byte)144,
		(byte)146,
		(byte)148,
		(byte)150,
		(byte)152,
		(byte)154,
		(byte)156,
		(byte)158,
		(byte)160,
		(byte)162,
		(byte)164,
		(byte)166,
		(byte)168,
		(byte)170,
		(byte)172,
		(byte)174,
		(byte)176,
		(byte)178,
		(byte)180,
		(byte)182,
		(byte)184,
		(byte)186,
		(byte)188,
		(byte)190,
		(byte)192,
		(byte)194,
		(byte)196,
		(byte)198,
		(byte)200,
		(byte)202,
		(byte)204,
		(byte)206,
		(byte)208,
		(byte)210,
		(byte)212,
		(byte)214,
		(byte)216,
		(byte)218,
		(byte)220,
		(byte)222,
		(byte)224,
		(byte)226,
		(byte)228,
		(byte)230,
		(byte)232,
		(byte)234,
		(byte)236,
		(byte)238,
		(byte)240,
		(byte)242,
		(byte)244,
		(byte)246,
		(byte)248,
		(byte)250,
		(byte)252,
		(byte)255
	};

	protected static byte[] blueStaticArray = {
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)0,
		(byte)4,
		(byte)8,
		(byte)12,
		(byte)16,
		(byte)20,
		(byte)24,
		(byte)28,
		(byte)32,
		(byte)36,
		(byte)40,
		(byte)44,
		(byte)48,
		(byte)52,
		(byte)56,
		(byte)60,
		(byte)64,
		(byte)68,
		(byte)72,
		(byte)76,
		(byte)80,
		(byte)84,
		(byte)88,
		(byte)92,
		(byte)96,
		(byte)100,
		(byte)104,
		(byte)108,
		(byte)112,
		(byte)116,
		(byte)120,
		(byte)124,
		(byte)128,
		(byte)132,
		(byte)136,
		(byte)140,
		(byte)144,
		(byte)148,
		(byte)152,
		(byte)156,
		(byte)160,
		(byte)164,
		(byte)168,
		(byte)172,
		(byte)176,
		(byte)180,
		(byte)184,
		(byte)188,
		(byte)192,
		(byte)196,
		(byte)200,
		(byte)204,
		(byte)208,
		(byte)212,
		(byte)216,
		(byte)220,
		(byte)224,
		(byte)228,
		(byte)232,
		(byte)236,
		(byte)240,
		(byte)244,
		(byte)248,
		(byte)252,
		(byte)255
	};

	public ColorPaletteHotIron() {
		red = redStaticArray;
		green = greenStaticArray;
		blue = blueStaticArray;
		sopInstanceUID= sopInstanceUIDStatic;
		contentLabel = contentLabelStatic;
		contentDescription = contentDescriptionStatic;
		contentCreatorName = contentCreatorNameStatic;
		referenceEncodedInstanceURL = referenceEncodedInstanceURLStatic;
		alternateContentDescription = alternateContentDescriptionStatic;
		alternateContentLanguageCodeValue = alternateContentLanguageCodeValueStatic;
		alternateContentLanguageCodeMeaning = alternateContentLanguageCodeMeaningStatic;
	}
}