package com.training.core.cronjob;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.Date;
import java.util.List;

public interface CustomProductsDAO {

    public default List<ProductModel> findAllProductsOlderThanSpecifiedDays(final Date oldDate) {
          return null;
    }
}
