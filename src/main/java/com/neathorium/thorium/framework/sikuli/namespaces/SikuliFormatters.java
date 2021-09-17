package com.neathorium.thorium.framework.sikuli.namespaces;

import com.neathorium.thorium.core.constants.validators.CoreFormatterConstants;
import com.neathorium.thorium.core.extensions.namespaces.predicates.DoublePredicates;
import com.neathorium.thorium.core.namespaces.validators.CoreFormatter;
import com.neathorium.thorium.framework.sikuli.constants.factories.MatchLazyLocatorFactoryConstants;

public interface SikuliFormatters {
    static String getFindAllMessage(int size, boolean status) {
        return (status ? "No Exception occurred, Found " + size + " matches" : "An exception has occurred during finding matches") + CoreFormatterConstants.END_LINE;
    }

    static String getPrecisionLessThanExpectedMessage(double precision, double expected) {
        var message = "";
        if (DoublePredicates.isSmallerThan(precision, expected)) {
            message += "Precision(\"" + precision + "\") was less than default(\"" + MatchLazyLocatorFactoryConstants.DEFAULT_PRECISION + "\")" + CoreFormatterConstants.END_LINE;
        }

        return CoreFormatter.getNamedErrorMessageOrEmpty("getPrecisionLessThanExpectedMessage", message);
    }
}
