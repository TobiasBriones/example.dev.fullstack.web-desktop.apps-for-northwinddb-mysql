<?php
/*
 * Copyright (c) 2020 Tobias Briones.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

namespace App\Data\RelationalModel\Relation;

use App\Domain\Model\Product\IdProductAttributes;

/**
 * Defines the tuple primary key attribute. The id is a positive autoincrement
 * integer.
 *
 * @package App\Data\RelationalModel\Relation
 */
interface PkIdTupleAttribute {

    public const ID_PK_ATTR_NAME = IdProductAttributes::ID_ATTR_NAME;

    public function id(): int;

}