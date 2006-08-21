/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.model.util;

import org.eclipse.birt.report.model.api.elements.DesignChoiceConstants;
import org.eclipse.birt.report.model.api.util.StringUtil;

/**
 * The utility class to convert values between parameter type choices and column
 * data type choices.
 * 
 */

public class DataTypeConversionUtil
{

	/**
	 * Returns the corresponding parameter type choice with the given column
	 * data type.
	 * 
	 * @param columnType
	 *            the column data type
	 * @return the parameter type
	 */

	public static String converToParamType( String columnType )
	{
		if ( StringUtil.isBlank( columnType ) )
			return null;

		if ( DesignChoiceConstants.COLUMN_DATA_TYPE_ANY.equals( columnType ) )
			return DesignChoiceConstants.PARAM_TYPE_ANY;
		if ( DesignChoiceConstants.COLUMN_DATA_TYPE_BOOLEAN.equals( columnType ) )
			return DesignChoiceConstants.PARAM_TYPE_BOOLEAN;
		if ( DesignChoiceConstants.COLUMN_DATA_TYPE_DATETIME
				.equals( columnType ) )
			return DesignChoiceConstants.PARAM_TYPE_DATETIME;
		if ( DesignChoiceConstants.COLUMN_DATA_TYPE_DECIMAL.equals( columnType ) )
			return DesignChoiceConstants.PARAM_TYPE_DECIMAL;
		if ( DesignChoiceConstants.COLUMN_DATA_TYPE_FLOAT.equals( columnType ) )
			return DesignChoiceConstants.PARAM_TYPE_FLOAT;
		if ( DesignChoiceConstants.COLUMN_DATA_TYPE_INTEGER.equals( columnType ) )
			return DesignChoiceConstants.PARAM_TYPE_INTEGER;
		if ( DesignChoiceConstants.COLUMN_DATA_TYPE_STRING.equals( columnType ) )
			return DesignChoiceConstants.PARAM_TYPE_STRING;

		return null;
	}

	/**
	 * Returns the corresponding column data type choice with the given
	 * parameter type.
	 * 
	 * @param paramType
	 *            the parameter type
	 * @return the column data type
	 */

	public static String converToColumnDataType( String paramType )
	{
		if ( StringUtil.isBlank( paramType ) )
			return null;

		if ( DesignChoiceConstants.PARAM_TYPE_ANY.equals( paramType ) )
			return DesignChoiceConstants.COLUMN_DATA_TYPE_ANY;
		if ( DesignChoiceConstants.PARAM_TYPE_BOOLEAN.equals( paramType ) )
			return DesignChoiceConstants.COLUMN_DATA_TYPE_BOOLEAN;
		if ( DesignChoiceConstants.PARAM_TYPE_DATETIME.equals( paramType ) )
			return DesignChoiceConstants.COLUMN_DATA_TYPE_DATETIME;
		if ( DesignChoiceConstants.PARAM_TYPE_DECIMAL.equals( paramType ) )
			return DesignChoiceConstants.COLUMN_DATA_TYPE_DECIMAL;
		if ( DesignChoiceConstants.PARAM_TYPE_FLOAT.equals( paramType ) )
			return DesignChoiceConstants.COLUMN_DATA_TYPE_FLOAT;
		if ( DesignChoiceConstants.PARAM_TYPE_INTEGER.equals( paramType ) )
			return DesignChoiceConstants.COLUMN_DATA_TYPE_INTEGER;
		if ( DesignChoiceConstants.PARAM_TYPE_STRING.equals( paramType ) )
			return DesignChoiceConstants.COLUMN_DATA_TYPE_STRING;

		return null;
	}
}
